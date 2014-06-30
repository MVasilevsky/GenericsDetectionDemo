package genericsreflection;

import java.lang.reflect.ParameterizedType;

/**
 * Runtime generic type detection demo
 * 
 * @author Max
 */
public class GenericsReflection {

    public static void main(String[] args) {
        ParameterizedType type = (ParameterizedType) InterfaceInteger.class.getGenericInterfaces()[0];
        System.out.println(type.getActualTypeArguments()[0]);
        
        BaseClass obj2 = new Second2();
        ParameterizedType type2 = (ParameterizedType) obj2.getClass().getGenericSuperclass();
        System.out.println(type2.getActualTypeArguments()[0]);
    }
    
}

interface Interface<T> {}
class InterfaceInteger implements Interface<Integer> {}
class InterfaceString implements Interface<String> {}

class BaseClass<T> {}
class First2 extends BaseClass<Integer> {}
class Second2 extends BaseClass<String> {}

