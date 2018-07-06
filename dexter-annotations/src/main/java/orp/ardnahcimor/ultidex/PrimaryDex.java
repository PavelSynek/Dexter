package orp.ardnahcimor.ultidex;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface PrimaryDex {
    boolean obfuscate() default false;

    String[] extras() default {"0"};
}