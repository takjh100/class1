create table todo (
    todo_id number primary key,
    todo varchar2(4000) not null,
    create_date date default sysdate not null,
    modify_date date,
    done char(1) not null
);
drop table todo;
drop sequence seq_todo;

insert into todo
values ( seq_todo.nextval, 'test', sysdate, null, 'N');

select * from todo;
commit;


update todo
set done = 'Y'
where todo_id = 4;
commit;

select to_char(sysdate,'YYYY/MM/DD HH24:mm:SS') from todo;