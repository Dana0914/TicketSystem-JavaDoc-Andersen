package andersen.lesson.service;


import andersen.lesson.model.BusTicket;
import andersen.lesson.tickettype.TicketType;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class BusTicketService {
    List<BusTicket> busTickets;
    public BusTicketService() {
        busTickets = new ArrayList<>();
    }

    public List<BusTicket> getBusTickets() {
        return busTickets;
    }

    /**
     * adds ticket to storage
     * @param busTicket the instance of ticket
     * @code busTickets is ArrayList
     */
    public void addBusTicket(BusTicket busTicket) {
        busTickets.add(busTicket);
        System.out.println("Ticket added to storage");
    }

    /**
     * removes ticket from storage
     * @param id the id of Ticket
     * @code Iterates through the busTickets storage
     *
     */
    public void removeTicketById(String id) {
        for (Iterator<BusTicket> iterator = busTickets.iterator(); iterator.hasNext();) {
            BusTicket busTicket = iterator.next();
            if (busTicket.getId().equals(id)) {
                iterator.remove();
            }
        }
        System.out.println("Ticket removed from storage");
    }

    /**
     * search tickets by its price
     * @param price price of Ticket
     * @code the price compares with BigDecimal and expected to be between 100 and 1000
     */
    public void searchTicketByPrice(BigDecimal price) {
        if (price.compareTo(new BigDecimal("100")) > 0 &&
        price.compareTo(new BigDecimal("1000")) < 0) {
            for (BusTicket busTicket : busTickets) {
                if (busTicket.getPrice().equals(price)) {
                    System.out.println(busTicket.getPrice());
                }
            }
        }
    }

    /**
     * searches ticket by TicketType
     * @param ticketType is enum type of Ticket
     *
     */
    public void searchTicketByTicketType(TicketType ticketType) {
        for (BusTicket busTicket : busTickets) {
            if (busTicket.getTicketType().equals(ticketType)) {
                System.out.println(busTicket.getTicketType());
            }
        }
    }
}
