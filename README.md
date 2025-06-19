**Integrações Assíncronas em Java**

***Nome: Gustavo Rodrigues AndréRA: 1072318393***

Introdução

Integrações assíncronas têm um papel fundamental em sistemas distribuídos modernos. Elas permitem que aplicações se comuniquem sem bloqueios, aumentando a escalabilidade, desempenho e tolerância a falhas. Diferente das integrações síncronas, onde uma aplicação espera pela resposta da outra, nas assíncronas a comunicação é feita de forma desacoplada, normalmente com uso de filas ou eventos.

Conceitos de Integração Assíncrona

Mensageria: Utiliza filas para troca de mensagens entre sistemas.

Event-driven architecture: Baseia-se em eventos emitidos e processados de forma reativa.

Callback, Future e CompletableFuture: Abordagens para lidar com resultados futuros no código Java.

Ferramentas e Tecnologias

1. Apache Kafka

Plataforma distribuída de streaming de eventos.

Suporta alto throughput e é bastante usada em microserviços.

Permite publicação e subscrição assíncrona de mensagens.

2. RabbitMQ

Broker de mensagens baseado em filas.

Usa o protocolo AMQP.

Ótimo para workloads que exigem confiabilidade e ordenação.

3. Java CompletableFuture

Parte da biblioteca java.util.concurrent.

Permite execução assíncrona e composição de chamadas assíncronas.

4. Spring Boot + @Async

Com a anotação @Async, é possível executar métodos de forma assíncrona.

Requer a habilitação via @EnableAsync na configuração.

5. Reactor / Project Reactor (Spring WebFlux)

Permite criação de APIs reativas e não-bloqueantes.

Baseado no paradigma de Reactive Streams.

Exemplos em Java

Exemplo 1: Usando CompletableFuture

import java.util.concurrent.CompletableFuture;

public class AsyncExample {
    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Executando tarefa assíncrona");
        });

        future.join();
        System.out.println("Tarefa concluída");
    }
}

Exemplo 2: Usando Spring Boot com @Async

@Service
public class EmailService {

    @Async
    public void enviarEmail(String destinatario) {
        System.out.println("Enviando e-mail para: " + destinatario);
    }
}

@Configuration
@EnableAsync
public class AsyncConfig {
}

Exemplo 3: Consumidor Kafka (Spring Boot)

@KafkaListener(topics = "eventos", groupId = "grupo1")
public void consumirMensagem(String mensagem) {
    System.out.println("Mensagem recebida: " + mensagem);
}

Considerações Finais

Integrações assíncronas permitem maior eficiência na comunicação entre sistemas, especialmente em ambientes com alta demanda. Ferramentas como Kafka e RabbitMQ, aliadas a APIs como CompletableFuture e frameworks como Spring, oferecem suporte robusto para desenvolver aplicações modernas e escaláveis.

Referências

https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html

https://spring.io/guides/gs/messaging-redis/

https://kafka.apache.org/documentation/

https://www.rabbitmq.com/tutorials/tutorial-one-java.html

https://docs.spring.io/spring-framework/reference/integration/async.html


