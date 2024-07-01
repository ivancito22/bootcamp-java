const apiUrl = "https://pokeapi.co/api/v2/pokemon";
const speciesUrl = "https://pokeapi.co/api/v2/pokemon-species";
const app = document.getElementById("app");
const searchInput = document.getElementById("search");
const pokemonList = document.getElementById("pokemon-list");
const pokemonDetail = document.getElementById("pokemon-detail");
const pokemonInfo = document.getElementById("pokemon-info");
const backButton = document.getElementById("back-button");

let pokemons = [];

const fetchPokemons = async () => {
  try {
    const response = await fetch(apiUrl);
    const data = await response.json();
    const pokemonDetails = await Promise.all(
      data.results.map((pokemon) =>
        fetch(pokemon.url).then((res) => res.json())
      )
    );

    pokemons = pokemonDetails;
    displayPokemons(pokemons);
  } catch (error) {
    console.error("Error fetching Pokémon data:", error);
  }
};

const displayPokemons = (pokemons) => {
  pokemonList.innerHTML = pokemons
    .map(
      (pokemon) => `
        <div class="pokemon-card" onclick="showPokemonDetail(${pokemon.id})">
            <div class="image">
            <img src="${pokemon.sprites.front_default}" alt="${pokemon.name}">
            </div>
            <div class="Id">
             <div class="iden">ID/${pokemon.id}</div><br>
            <p class= "nombre"><b>${pokemon.name}</b></p>
            <p class="property1">${pokemon.types[0].type.name}</p>
            <p class="property2">${pokemon.types[1]?.type.name}</p>
            <div class= "evo">
            <p class= "ev">Evoluciona de:</p>
            <p>${pokemon.is_default ? "Base" : "Evoluciona de"}</p>
            </div>
            </div>
        </div>   
    `
    )
    .join("");
};

const filterPokemons = (event) => {
  const searchText = event.target.value.toLowerCase();
  const filteredPokemons = pokemons.filter((pokemon) =>
    pokemon.name.toLowerCase().includes(searchText)
  );
  displayPokemons(filteredPokemons);
};

const showPokemonDetail = (id) => {
  const pokemon = pokemons.find((pokemon) => pokemon.id === id);
  const newWindow = window.open("", "_blank");

  newWindow.document.write(`
        <!DOCTYPE html>
        <html lang="es">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>${pokemon.name} Details</title>
            <style>
                body {
                    font-family: Arial, sans-serif;
                    padding: 20px;
                    text-align: center;
                }
                img {
                    width: 200px;
                    height: 200px;
                }
                     button {
                    margin-top: 20px;
                    padding: 10px 20px;
                    font-size: 16px;
                    cursor: pointer;
                }
            </style>
        </head>
        <body>
            <h2>${pokemon.id}. ${pokemon.name}</h2>
            <img src="${pokemon.sprites.front_default}" alt="${pokemon.name}">
            <p>Tipo: ${pokemon.types
              .map((type) => type.type.name)
              .join(", ")}</p>
            <p>Evolución: ${pokemon.is_default ? "Base" : "Evolución"}</p>
            <button id="backButton" onclick="window.close()">Volver al listado</button>

        </body>
        </html>
    `);
};

const showPokemonList = () => {
  pokemonDetail.classList.add("hidden");
  pokemonList.classList.remove("hidden");
  pokemonDetail.style.display = "none";
};

searchInput.addEventListener("input", filterPokemons);
backButton.addEventListener("click", showPokemonList);

fetchPokemons();
