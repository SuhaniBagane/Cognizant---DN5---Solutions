import org.junit.jupiter.api.Test;

import org.mockito.InOrder;

import static org.mockito.Mockito.*;

public class OrderedServiceTest {

    @Test
    void testOrder() {

        OrderedService service = mock(OrderedService.class);

        service.first();

        service.second();

        InOrder order = inOrder(service);

        order.verify(service).first();

        order.verify(service).second();

    }

}