# Write your MySQL query statement below
select distinct player_id,MIN(event_date) OVER(partition by player_id) as first_login from activity;
