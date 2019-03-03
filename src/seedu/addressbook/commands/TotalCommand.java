package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;


/**
 * Give the number of all persons in the address book to the user.
 */
public class TotalCommand extends Command {

    public static final String COMMAND_WORD = "total";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Total number of persons in the address book.\n"
            + "Example: " + COMMAND_WORD;


    @Override
    public CommandResult execute() {
        List<ReadOnlyPerson> totalList = addressBook.getAllPersons().immutableListView();
        int TOTALNUMBER = totalList.size();

        return new CommandResult(TOTALNUMBER+" "+
                "IS THE TOTAL NUMBER OF EXISTING CONTACTS");
    }
}


