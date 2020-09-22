SELECT employee_id, last_name, salary, department_id
FROM HR.employees
WHERE manager_id= &manager
ORDER BY &order;