FROM corretto:17
LABEL maintainer="emanuelBegnis"
COPY target/trimixABM-0.0.1-SNAPSHOT.jar trimixABM-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/trimixABM-0.0.1-SNAPSHOT.jar"]