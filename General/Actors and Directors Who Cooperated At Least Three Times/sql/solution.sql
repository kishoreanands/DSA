1# Write your MySQL query statement below
2Select actor_id,director_id from ActorDirector 
3group by director_id , actor_id
4having count(timestamp)>=3;