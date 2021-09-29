package food.delivery.teampersonal;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="callOrders", path="callOrders")
public interface CallOrderRepository extends PagingAndSortingRepository<CallOrder, Long>{


}
