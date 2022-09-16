package org.example.state;

import java.util.EnumSet;

import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;

import static org.example.state.RegEventEnum.*;
import static org.example.state.RegStatusEnum.CONNECTED;
import static org.example.state.RegStatusEnum.UNCONNECTED;
import static org.example.state.RegStatusEnum.LOGINING;
import static org.example.state.RegStatusEnum.LOGIN_INTO_SYSTEM;


@Configuration
@EnableStateMachine // 开启状态机配置
public class StateMachineConfig extends EnumStateMachineConfigurerAdapter{

    /**
     * 配置状态机状态
     */
    @Override
    public void configure(StateMachineStateConfigurer states) throws Exception {
        states.withStates()
        // 初始化状态机状态
        .initial(UNCONNECTED)
        // 指定状态机的所有状态
        .states(EnumSet.allOf(RegStatusEnum.class));
    }

    /**
     * 配置状态机状态转换
     */
    @Override
    public void configure(StateMachineTransitionConfigurer transitions) throws Exception {
        // 1. connect UNCONNECTED -&gt; CONNECTED
//        transitions.withExternal()
//            .source(UNCONNECTED)
//            .target(CONNECTED)
//            .event(CONNECT)
//        // 2. beginToLogin CONNECTED -&gt; LOGINING
//        .and().withExternal()
//            .source(CONNECTED)
//            .target(LOGINING)
//            .event(BEGIN_TO_LOGIN)
//        // 3. login failure LOGINING -&gt; UNCONNECTED
//        .and().withExternal()
//            .source(LOGINING)
//            .target(UNCONNECTED)
//            .event(LOGIN_FAILURE)
//        // 4. login success LOGINING -&gt; LOGIN_INTO_SYSTEM
//        .and().withExternal()
//            .source(LOGINING)
//            .target(LOGIN_INTO_SYSTEM)
//            .event(LOGIN_SUCCESS)
//        // 5. logout LOGIN_INTO_SYSTEM -&gt; UNCONNECTED
//        .and().withExternal()
//            .source(LOGIN_INTO_SYSTEM)
//            .target(UNCONNECTED)
//            .event(LOGOUT);
    }
}