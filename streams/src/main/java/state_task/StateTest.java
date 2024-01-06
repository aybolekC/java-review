package state_task;

import java.util.Arrays;
import java.util.List;

public class StateTest {

    public static void main(String[] args) {

        State va=new State();
        va.sddCity("McLean");
        va.sddCity("Arlington");
        va.sddCity("Fairfax");
        va.sddCity("FallsChurch");


        State tx=new State();
        tx.sddCity("Dallas");
        tx.sddCity("Plano");
        tx.sddCity("Austin");
        tx.sddCity("Houston");


        List<State> list= Arrays.asList(va,tx);

//        list.stream().map(State::getCities).forEach(System.out::println);
//        [McLean, Arlington, Fairfax, FallsChurch]
//        [Dallas, Plano, Austin, Houston]

        list.stream()
                .map(state -> state.getCities())
                .flatMap(List::stream)
                .forEach(System.out::println);

        System.out.println("Shorter way of calling stream methos to remove stream<stream<String>> return type");
        list.stream()
                .flatMap(state -> state.getCities().stream())
                .forEach(System.out::println);


    }
}
