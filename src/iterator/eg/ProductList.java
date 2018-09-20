package iterator.eg;

import java.util.List;

/**
 * Created by penelope on 2017/8/9.
 */
public class ProductList extends AbstractObjectList {
    public ProductList(List<Object> products) {
        super(products);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
