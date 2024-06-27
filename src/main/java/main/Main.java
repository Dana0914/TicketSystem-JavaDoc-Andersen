package main;

import model.BusTicket;
import service.BusTicketService;
import tickettype.TicketType;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BusTicket busTicket1 = new BusTicket(TicketType.WEEK, LocalDate.now(), new BigDecimal("120"), "1245");
        BusTicket busTicket2 = new BusTicket(TicketType.DAY, LocalDate.of(2024, 7, 7), new BigDecimal("410"), "7856");
        BusTicket busTicket3 = new BusTicket(TicketType.MONTH, LocalDate.of(2024, 7, 15), new BigDecimal("200"), "8632");
        BusTicketService service = new BusTicketService();
        service.addBusTicket(busTicket1);
        service.addBusTicket(busTicket2);
        service.addBusTicket(busTicket3);

        System.out.println(service.getBusTickets());
        service.removeTicketById(busTicket1.getId());
        service.searchTicketByPrice(busTicket2.getPrice());
        service.searchTicketByTicketType(TicketType.DAY);
        System.out.println(service.getBusTickets());


    }
}
