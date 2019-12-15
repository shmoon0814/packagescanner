package spring.custom.lib.packagescanner;

import org.springframework.context.annotation.Import;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(UtilBeans.class)
public @interface UtilBeanConfiguration {
    String[] basePackages() default {};
}