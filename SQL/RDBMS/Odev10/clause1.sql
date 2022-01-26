SELECT country,city FROM country
LEFT JOIN city ON city.country_id = country.country_id
ORDER BY country
