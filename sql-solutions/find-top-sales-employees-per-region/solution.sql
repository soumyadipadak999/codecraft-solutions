-- Find Top Sales Employees per Region
-- Dialect: MYSQL

SELECT r.name AS region, e.name AS employee, t.total_sales AS sales
FROM (
    SELECT e.id, e.name, e.region_id, SUM(s.amount) AS total_sales
        FROM employees e
            JOIN sales s ON e.id = s.employee_id
                GROUP BY e.id, e.name, e.region_id
                ) t
                JOIN employees e ON t.id = e.id
                JOIN regions r ON e.region_id = r.id
                WHERE (e.region_id, t.total_sales) IN (
                    SELECT e.region_id, MAX(total_sales)
                        FROM (
                                SELECT e.id, e.region_id, SUM(s.amount) AS total_sales
                                        FROM employees e
                                                JOIN sales s ON e.id = s.employee_id
                                                        GROUP BY e.id, e.region_id
                                                            ) sub
                                                                GROUP BY region_id
                                                                );