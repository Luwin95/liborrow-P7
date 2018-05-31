FROM alpine:edge
MAINTAINER luwin95
RUN apk add --no-cache openjdk8
COPY UnlimitedJCEPolicyJDK8/* \
  /usr/lib/jvm/java-1.8-openjdk/jre/lib/security/
COPY liborrow-callagainbatch-batch-1.1.1-SNAPSHOT.jar /
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar","/liborrow-callagainbatch-batch-1.1.1-SNAPSHOT.jar"]
EXPOSE 8888