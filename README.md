# Spring-Hibernate-Prototype
Simple DB app with Spring and Hibernate Framework

This is a MySQL/Hibernate and Spring Database application. 

There are five tables namely Teams, Players, Sponsors, DefandGk and Attackers. Teams and Players are linked with a foreign key of
a teamID in the Players table. Sponors is an embedded table in the Teams. Attackers and DefAndGk table inherits Players. 

Data Access Objects is built only for Teams as it is a small protoype, and TeamsDaoImpl.java file runs the methods of the TeamsDao
which contains the HQL query for Database manipulation and creation.

All the annotations, components and the hibernate properties are defined in the spring.xml file.

