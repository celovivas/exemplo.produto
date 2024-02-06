# exemplo.produto
Projeto de exemplo com java e kafka produzindo e consumindo um json


Estudando kafka
-----------------------

Vídeos utilizados como estudo:
https://www.youtube.com/watch?v=3xxb_QyrFnw
https://www.youtube.com/watch?v=ZOzvU1I-9io


Para fazer o download do kafka: https://kafka.apache.org/downloads


Para rodar:
Descompactar o kafka e acessar a pasta /bin:

Abrir o Terminal 1:
./zookeeper-server-start.sh ../config/zookeeper.properties

Abrir o Terminal 2:
./kafka-server-start.sh ../config/server.properties

Abrir o terminal Terminal 3:
- Comando para listar os tópicos ativos
  ./kafka-topics.sh --bootstrap-server localhost:9092 --describe

-Comando para criar um tópico e inicialmente com 1 partição:
./kafka-topics.sh --bootstrap-server localhost:9092 --topic compras.do.cliente --create partitions 1


-Comando para criar um tópico e inicialmente com 1 partição:
./kafka-topics.sh --bootstrap-server localhost:9092 --topic ecommerce.x --create partitions 1
