package Steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.example.BankAccount;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankAccountSteps {
/*test*/
    private BankAccount monAccount;
    private int i_montant;

    @Given("je suis sur la page de depot avec un {int} dans mon compte")
    public void je_suis_sur_la_page_depot(int solde) {
        System.out.println("Dans Given");
        monAccount = new BankAccount(solde);
    }

    @When("je remplis le champ avec un {int}")
    public void je_remplis_le_champ_avec_un_montant(int montant){
        System.out.println("Dans When");
        i_montant = montant;
    }

    @And("je clique sur Deposer")
    public void je_clique_sur_deposer(){
        System.out.println("Dans And");
        monAccount.deposit(i_montant);
    }

    @Then("je devrais voir un message de depot effectue avec succes et le solde {int}")
    public void je_devais_voir_un_message_de_depot_effectue_avec_succes(int attendue){
        System.out.println("Dans Then");
        assertEquals(attendue,monAccount.checkBalance());
        System.out.println(" SUCCES ");
        System.out.println(" ");

    }
}
