package support;

import java.lang.reflect.ParameterizedType;

abstract class Factory<T> {
    public Factory() {

    }

    public T generateInstance() throws Exception {
    	ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();
    	Class<T> aClass = (Class<T>) type.getActualTypeArguments()[0];
        return aClass.getDeclaredConstructor().newInstance();
    }
}
