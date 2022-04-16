FROM openjdk:8
COPY ./target/CalculatorSPE-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","CalculatorSPE-1.0-SNAPSHOT-jar-with-dependencies.jar","calculator.Calculator"]