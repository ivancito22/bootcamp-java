# Prácticas de MySQL

Solución de los ejercicios de https://sqlbolt.com/

## Lesson 1: SELECT queries 101

### Exercise 1 — Tasks
1. Find the title of each film
```sql
SELECT title FROM movies;
```
2. Find the of each film director
```sql
SELECT director FROM movies;
```

3. Find the and of each film title director
```sql
SELECT title, director FROM movies;
```

4. Find the and of each film title year
```sql
SELECT title, year FROM movies;
```

5. Find the information about each film all
```sql
SELECT * FROM movies;
```

### Exersice 2 — Tasks
1. Find the movie with a row id of 6
```sql
SELECT * FROM movies WHERE ID = 6;
```

2. Find the movies released in the years between 2000 and 2010
```sql
SELECT title FROM movies WHERE YEAR BETWEEN 2000 and 2010;
```

3. Find the movies not released in the years between 2000 and 2010
```SQL
SELECT title FROM movies WHERE YEAR NOT BETWEEN 2000 and 2010;
```

4. Find the first 5 Pixar movies and their release year
```sql
SELECT title FROM movies ORDER BY year LIMIT 5;
```

### Exersice 3. — Tasks
1. Find all the Toy Story movies
```sql
SELECT * FROM movies WHERE title like "Toy Story%";
```

2. Find all the movies directed by John Lasseter
```sql
SELECT * FROM movies WHERE director = "John Lasseter";
```

3. Find all the movies (and director) not directed by John Lasseter
```sql
SELECT * FROM movies WHERE director <> "John Lasseter";
```

4. Find all the WALL-* movies
```sql
SELECT * FROM movies WHERE title like "WALL-%"
```

### Exersice 4. — Tasks
1. List all directors of Pixar movies (alphabetically), without duplicates
```sql
SELECT DISTINCT director FROM movies
ORDER BY director ASC;
```

2. List the last four Pixar movies released (ordered from most recent to least)
```sql
SELECT title FROM movies ORDER BY year LIMIT 4;
```

3. List the first five Pixar movies sorted alphabetically 
```sql
SELECT title FROM movies ORDER BY title ASC LIMIT 5;
```

4. List the next five Pixar movies sorted alphabetically
```sql
SELECT title FROM movies ASC LIMIT 5 OFFSET 5;
```

### Review 1 — Tasks
1. List all the Canadian cities and their populations
```sql
SELECT city, population FROM north_american_cities
WHERE country = "Canada";
```

2. Order all the cities in the United States by their latitude from north to south
```sql
SELECT city, latitude FROM north_american_cities
WHERE country = "United States"
ORDER BY latitude DESC;
```

3. List all the cities west of Chicago, ordered from west to east
```sql
SELECT city, longitude FROM north_american_cities
WHERE longitude < -87.629798
ORDER BY longitude ASC;
```

4. List the two largest cities in Mexico (by population)
```sql
SELECT city, population FROM north_american_cities
WHERE country LIKE "Mexico"
ORDER BY population DESC
LIMIT 2;
```

5. List the third and fourth largest cities (by population) in the United States and their population
```sql
SELECT city, population FROM north_american_cities
WHERE country LIKE "United States"
ORDER BY population DESC
LIMIT 2 OFFSET 2-4;
```

### Exercise 6 — Tasks
1. Find the domestic and international sales for each movie
```sql
SELECT title, domestic_sales, international_sales 
FROM movies
  JOIN boxoffice
    ON movies.id = boxoffice.movie_id;
```
2. Show the sales numbers for each movie that did better internationally rather than domestically
```sql
SELECT m.title, s.domestic_sales, s.international_sales
FROM movies m
INNER JOIN Boxoffice s ON m.id = s.movie_id
WHERE s.international_sales > s.domestic_sales;
```

3. List all the movies by their ratings in descending order
```sql
SELECT title, rating
FROM movies
  JOIN boxoffice
    ON movies.id = boxoffice.movie_id
ORDER BY rating DESC;
```
