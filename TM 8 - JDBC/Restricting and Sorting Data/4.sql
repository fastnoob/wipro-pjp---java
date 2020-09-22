SELECT 
    last_name,
    job_id,
    hire_date
 FROM HR.employees
 WHERE last_name = 'Matos' or last_name = 'Taylor'
 ORDER BY hire_date;