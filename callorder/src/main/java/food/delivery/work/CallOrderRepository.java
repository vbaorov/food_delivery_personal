package food.delivery.work;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "callorders", path = "callorders")
public interface CallOrderRepository extends PagingAndSortingRepository<CallOrder, Long> {

}
