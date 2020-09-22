SELECT 
    me.employee_id,
    me.first_name,
    me.last_name,
    me.department_id,
    me.salary*1.1 as salary
FROM my_employee me
WHERE me.department_id=90;
