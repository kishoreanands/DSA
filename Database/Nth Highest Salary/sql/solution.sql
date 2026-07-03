-- CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
-- BEGIN 
-- set N=N-1;
--   RETURN (
--     select distinct salary from Employee order by salery desc limit 1 OFFSET N

--   );
-- END
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    SET N = N - 1;
    RETURN (
        SELECT DISTINCT salary
        FROM Employee
        ORDER BY salary DESC
        LIMIT 1 OFFSET N
    );
END