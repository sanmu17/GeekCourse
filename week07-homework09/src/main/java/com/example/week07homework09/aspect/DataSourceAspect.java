package com.example.week07homework09.aspect;

import com.example.week07homework09.datasource.DynamicDataSource;
import com.example.week07homework09.enums.CurDataSource;
import com.example.week07homework09.enums.DataSourceChanges;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


/**
 * 类描述：
 *
 * @ClassName DataSourceAspect
 * @Description TODO
 * @Author 1537414333@qq.com
 * @Date 2021/12/19 18:20
 * @Version 1.0
 */
@Slf4j
@Aspect
@Component
public class DataSourceAspect implements Ordered {
    @Pointcut("@annotation(com.example.week07homework09.enums.CurDataSource)")
    public void dataSourcePointCut() {

    }

    @Around("dataSourcePointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();

        CurDataSource ds = method.getAnnotation(CurDataSource.class);
        if (ds == null) {
            DynamicDataSource.setDataSourceType(String.valueOf(DataSourceChanges.MASTER));
            log.debug("set datasource is " + DataSourceChanges.MASTER);
        } else {
            DynamicDataSource.setDataSourceType(ds.name());
            log.debug("set datasource is " + ds.name());
        }

        try {
            return point.proceed();
        } finally {
            DynamicDataSource.clearDataSourceType();
            log.debug("clean datasource");
        }
    }

    @Override
    public int getOrder() {
        return 1;
    }



}
