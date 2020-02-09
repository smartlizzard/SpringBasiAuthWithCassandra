# SpringBasiAuthWithCassandra

setx PATH C:\Python27

CREATE KEYSPACE cassandrauser WITH REPLICATION = { 'class' : 'NetworkTopologyStrategy', 'datacenter1' : 1 } AND DURABLE_WRITES = false;


cqlsh> USE cassandrauser;
cqlsh:tutorialspoint>; CREATE TABLE cassandrausers(id int PRIMARY KEY,username text,password text,email text);
   
   select * from cassandrausers;
   
   
   insert into users(username,password,enabled)
	values('admin','$2a$10$hbxecwitQQ.dDT4JOFzQAulNySFwEpaFLw38jda6Td.Y/cOiRzDFu',true);
insert into authorities(username,authority) 
	values('admin','ROLE_ADMIN');
	
	
	INSERT INTO cassandrausers (id, username, password,email) VALUES(2,'jitu', '$2a$10$hbxecwitQQ.dDT4JOFzQAulNySFwEpaFLw38jda6Td.Y/cOiRzDFu','G@gmail.com');
	INSERT INTO cassandrausers (id, username, password,email) VALUES(1,'user', 'password','G@gmail.com');
	
	admin@123
	
	Query; CQL [SELECT * FROM cassandrausers WHERE username='jitu' ALLOW FILTERING;];
	
	@Query(select * from event_owner.cassandrausers)
	
	return Collections.singleton(new SimpleGrantedAuthority("USER"));
	
	@Table("cassandrausers")
	
	DROP TABLE cassandrausers;
	
	
	DROP KEYSPACE cassandrauser
	git remote add origin https://github.com/smartlizzard/SpringBasiAuthWithCassandra.git
	
