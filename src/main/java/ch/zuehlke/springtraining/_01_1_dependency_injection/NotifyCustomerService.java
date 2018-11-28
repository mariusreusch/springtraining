package ch.zuehlke.springtraining._01_1_dependency_injection;

public class NotifyCustomerService {

    private final InvoiceSystemService invoiceSystemService = new InvoiceSystemService();
    private final ContactInfoSystemService contactInfoSystemService = new ContactInfoSystemService();
    private final EMailService eMailService = new EMailService();
    private final MailService mailService = new MailService();

    public void informCustomerAboutPendingInvoices(){

    }

}


//What are dependencies? In this case NotifyCustomerService has dependencies on
//Inversion of Control: the customer currently controls the instantiation of all its dependencies. And
//The IOC container of spring is called Application Context. All beans will created within this ApplicationContext
//The process of finding the correct bean and instantiate this bean is called autowiring