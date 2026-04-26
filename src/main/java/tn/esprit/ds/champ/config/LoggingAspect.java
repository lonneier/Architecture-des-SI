
package tn.esprit.ds.champ.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger log =
            LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("execution(* tn.esprit.ds.champ.services.*.*(..))")
    public void serviceMethods(){}

    @Before("serviceMethods()")
    public void beforeLog(JoinPoint jp){
        log.info("BEFORE -> {}", jp.getSignature().getName());
    }

    @After("serviceMethods()")
    public void afterLog(JoinPoint jp){
        log.info("AFTER -> {}", jp.getSignature().getName());
    }

    @AfterReturning(pointcut="serviceMethods()", returning="result")
    public void returnLog(JoinPoint jp, Object result){
        log.info("RETURN -> {} = {}", jp.getSignature().getName(), result);
    }

    @AfterThrowing(pointcut="serviceMethods()", throwing="ex")
    public void errorLog(JoinPoint jp, Exception ex){
        log.error("ERROR -> {} : {}", jp.getSignature().getName(), ex.getMessage());
    }

    @Around("serviceMethods()")
    public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {

        long start = System.currentTimeMillis();

        Object obj = pjp.proceed();

        long end = System.currentTimeMillis();

        log.info("TIME -> {} = {} ms",
                pjp.getSignature().getName(),
                (end - start));

        return obj;
    }
}

