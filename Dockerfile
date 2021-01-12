FROM openjdk:11

RUN mkdir hello
WORKDIR hello

COPY bin/MANIFEST.mf ./bin/MANIFEST.mf
COPY compile.sh .
COPY src ./src

RUN ./compile.sh

ENTRYPOINT java -jar bin/Hello.jar
