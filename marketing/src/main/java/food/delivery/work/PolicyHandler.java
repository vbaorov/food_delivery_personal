package food.delivery.work;

import food.delivery.work.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @Autowired PromoteRepository promoteRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverDeliveryStarted_DeliveryCompleted(@Payload DeliveryStarted deliveryStarted){

        if(!deliveryStarted.validate()) return;

        System.out.println("\n\n##### listener DeliveryCompleted : " + deliveryStarted.toJson() + "\n\n");



        // Sample Logic //
        // Promote promote = new Promote();
        // promoteRepository.save(promote);

    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
