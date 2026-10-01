FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY StudentGrade.java .

RUN javac StudentGrade.java

CMD ["java", "StudentGrade"]