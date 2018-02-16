FROM postgres:9.6  
MAINTAINER luwin95

ENV POSTGRES_USER admin  
ENV POSTGRES_PASSWORD password  
ENV POSTGRES_DB db_liborrow

ADD main.sql /docker-entrypoint-initdb.d/

EXPOSE 5432