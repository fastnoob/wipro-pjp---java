    SELECT 
        e.last_name,
        j.job_title
    FROM HR.employees e
    JOIN HR.jobs j
        ON e.job_id=j.job_id
    WHERE e.manager_id IS NULL;