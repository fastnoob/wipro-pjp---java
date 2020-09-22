    SELECT 
        e.last_name AS "Last Name",
        e.salary AS "Salary",
        e.commission_pct AS "Comission"
    FROM HR.employees e
    WHERE e.commission_pct IS NOT NULL
    ORDER BY e.salary, e.commission_pct;