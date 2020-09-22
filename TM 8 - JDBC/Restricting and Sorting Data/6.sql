    SELECT 
        first_name|| ' '||last_name AS Employee,
        salary AS "Montly Salary"
    FROM HR.employees
    WHERE (salary >= 5000 AND salary <=12000) AND (department_id=20 or department_id=50);