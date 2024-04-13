/*
 * DSA Lab Project Main Folder
 * Name : Muhammad Mehroz
 * Reg# : FA20-BSE-071
 * Section : B
 *
 *
 *
 * Data Structures used :: Linked List and Stack using linked list
 * Project Title: Contacts Management System
 * Description: User can Enter the contacts, Update the Contact , Delete the Contact , Search the Contact , Add Favours Contacts
 */


#include <stdio.h>
#include <malloc.h>
#include <string.h>

//Structure

// struct for contact
struct Contact_List{
    char Contact_name[50];
    char Contact_email[40];
    char Contact_number[40];
    struct Contact_List *nextLink;
};


//struct for recent contacts
struct RE_list{
    char RE_Name[50];
    struct RE_list *link;
};

//Function Declaration
void insert_Contact(struct Contact_List **ContactListhead ,char na[100] , char em[100],char phone[100]); // function to add new Contact
void Display_Contact(struct Contact_List *head);//  function  to display contact
void Search_contact(struct Contact_List *ContactListhead,struct RE_list **head_of_RE); //Search contact function
int delete_contact(struct Contact_List **ContactListhead,char delname [100]);//delete a contact
void update_function(struct Contact_List *head,struct Contact_List *HeadF);//Update an existing contact info


//Recent Contact function
void recent_contact(struct RE_list **head_of_RE , char [100]); // function to check the recent searched contaact
void displayrecent(struct RE_list *head_of_re);//

//Favriouts contact
void add_fav_Contact(struct Contact_List *head, struct Contact_List **headf);
void del_fav(struct Contact_List **HeadF,char delname[100]);
void update_fav(struct Contact_List *HeadF,char update_name[], char name[],char phone[],char email[]);


//Supportive Function
void sorting_alphabetical(struct Contact_List *head); // this function is used to sort the contacts in ascending order
int check_the_positionof(struct Contact_List *head,char [100]);


//Nodes
struct Contact_List *p = NULL; //  this node is for the contact list
struct RE_list *r = NULL; // This node is for the Recent Contact list
struct Contact_List *fv = NULL; // node for the favriouts list

//Main Function

int main() {
    printf("************DSA Lab Project***** \n**************************\n");
    printf("\n* Muhammad Mehroz\n* FA20-BSE-071");
    printf("\n\n\t\t\t");
    printf("****\tContact Management System\t\t****\n");

    printf("\n");
    //Contact List head
    struct Contact_List *head = NULL;

    //Recent Contact List Head
    struct RE_list *HeadR =NULL;

    //Favorite contact List Head
    struct Contact_List *HeadF =NULL;

    int choice;
    do {
        //Menu
        printf("\n\t\t\t");
        printf("***************************************************\n");
        printf("\t\t\t");
        printf("****\tPress 1 to Insert Contact\t\t****\n");
        printf("\t\t\t");
        printf("****\tPress 2 to Display Contact\t\t****\n");
        printf("\t\t\t");
        printf("****\tPress 3 to Search Contact\t\t****\n");
        printf("\t\t\t");
        printf("****\tPress 4 to Display Recent Contact\t****\n");
        printf("\t\t\t");
        printf("****\tPress 5 to Edit Contact\t\t\t****\n");
        printf("\t\t\t");
        printf("****\tPress 6 to Delete  Contact\t\t****\n");
        printf("\t\t\t");
        printf("****\tPress 7 to Add Fav Contact\t\t****\n");
        printf("\t\t\t");
        printf("****\tPress 8 to Display Fav Contact\t\t****\n");
        printf("\t\t\t");
        printf("****\tPress 9 to Delete Fav Contact\t\t****\n");
        printf("\t\t\t");
        printf("****\tPress 0 to Exit\t\t\t\t****\n");
        printf("\t\t\t");
        printf("****************************************************");

        scanf("%d",&choice);

        switch (choice) {
            case 1:{
                char na[50];
                char em[40];
                char phone[40];
                printf("\n************ Enter Contact Information *******************\n");
                printf("->Enter Name: ");
                fflush(stdin);
                gets(na);
                printf("\n->Enter the Contact Number: ");
                scanf("%s",&phone);
                printf("\n->Enter the Email: ");
                scanf("%s",&em);
                insert_Contact(&head,na,em,phone);

            }break;
            case 2:
                printf("\n\n\t\t************* Phone Book ************");
                Display_Contact(head);
                break;
            case 3:
                Search_contact(head,&HeadR);
                break;
            case 4:
                displayrecent(HeadR);
                break;
            case 5:
                update_function(head,HeadF);
                break;
            case 6:
                {
                    printf("\n***** Contact Deletion *******");
                    char delname[100];
                    printf("\nName you want to Delete: ");
                    fflush(stdin);
                    gets(delname);
                    delete_contact(&head,delname);
                    if(check_the_positionof(HeadF,delname) == 1){
                        fflush(stdin);
                        del_fav(&HeadF,delname);

                    }
                }
                break;
            case 7:
                add_fav_Contact(head, &HeadF);
                break;
            case 8:
                printf("\n\n\t\t************* Favorite Contact ************");
                Display_Contact(HeadF);
                break;
            case 9:
            {
                printf("************ Delete Fav Contact *********");
                char delname[50];
                printf("\nEnter the Name: " );
                fflush(stdin);
                gets(delname);
                del_fav(&HeadF,delname);
            }
                break;
            default:
                printf("\n*********** Incorrect choice ***********");
                break;
        }
    } while (choice!= 0);

    return 0;
}
//End Main




//************ Insert Contact Function*****
void insert_Contact(struct Contact_List **ContactListhead ,char na[50] , char em[40],char phone[40]){
    if(*ContactListhead == NULL){
        p = malloc(sizeof(struct Contact_List));
        strcpy(p->Contact_name,na);
        strcpy(p->Contact_email,em);
        strcpy(p->Contact_number,phone);
        p->nextLink = NULL;
        *ContactListhead = p;
    } else{
        struct Contact_List *temp1 = NULL; //Pointer for not entering the duplicate values
        temp1 = *ContactListhead;
        int c = 0;
        while (temp1 !=NULL){
            if(strcmp(na,temp1->Contact_name)==0){
                c =1;
                break;
            } else{
                temp1 = temp1->nextLink;
            }
            printf("\n*** Contact is Added ***\n\n");
        }//End Loop
        if(c == 0){
            struct Contact_List *q = NULL;
            q = malloc(sizeof (struct Contact_List));
            strcpy(q->Contact_name,na);
            strcpy(q->Contact_email,em);
            strcpy(q->Contact_number,phone);
            q->nextLink = NULL;
            p->nextLink = q;
            p =q;
            printf("\n*** Contact is Added ***\n\n");
        } else{
            printf("\n******* Contact is Already Present ****\n");
        }

    }//End else
}
//End Insertion New Contact


//**Display Function of Contact List*******
void Display_Contact(struct Contact_List *head){
    struct Contact_List *temp = NULL; //pinter
    temp = head;
    if(head == NULL){
        printf("\nContact List is Empty\n");
    } else {
        sorting_alphabetical(head); //here calling sort function so that the contats will be sort when ever we display them
        printf("\nSr.\t\t\tName\t\t\tPhoneNumber\t\t\tEmail");
        printf("\n***************************************************************************************\n");
        printf("\n");
        int count = 1;
        while (temp!=NULL){
            printf("%d\t\t\t",count);
            printf("%-10s\t\t",temp->Contact_name);
            printf("%-10s\t\t\t",temp->Contact_number);
            printf("%-10s",temp->Contact_email);
            printf("\n");
            temp = temp->nextLink;
            count ++;
        }
        printf("\n**************************************************************************************\n");
    }
}//End Display function



//******************** Sort Function ***************
void sorting_alphabetical(struct Contact_List *head){
    struct Contact_List *pa =NULL;
    struct Contact_List *pb =NULL;

    char temp_name[50];
    char temp_number[40];
    char temp_email[40];

    pa = head;

    while(pa != NULL){
        pb = pa->nextLink;
        while (pb != NULL){
            if(pa->Contact_name[0] > pb->Contact_name[0]){
                /*
                 * this is comparing the first elements of the names and sorting them.
                 * if the first character of the first name is greater than the second named first character then it swap the them
                 */
                strcpy(temp_name,pb->Contact_name);
                strcpy(pb->Contact_name,pa->Contact_name);
                strcpy(pa->Contact_name,temp_name);

                strcpy(temp_email,pb->Contact_email);
                strcpy(pb->Contact_email,pa->Contact_email);
                strcpy(pa->Contact_email,temp_email);

                strcpy(temp_number,pb->Contact_number);
                strcpy(pb->Contact_number,pa->Contact_number);
                strcpy(pa->Contact_number,temp_number);
            }
            else if((pa->Contact_name[0] == pb->Contact_name[0]) &&( pa->Contact_name[1] > pb->Contact_name[1])){
                strcpy(temp_name,pb->Contact_name);
                strcpy(pb->Contact_name,pa->Contact_name);
                strcpy(pa->Contact_name,temp_name);

                strcpy(temp_email,pb->Contact_email);
                strcpy(pb->Contact_email,pa->Contact_email);
                strcpy(pa->Contact_email,temp_email);

                strcpy(temp_number,pb->Contact_number);
                strcpy(pb->Contact_number,pa->Contact_number);
                strcpy(pa->Contact_number,temp_number);
            }
            pb =pb->nextLink;
        }//End Inner loop
        pa= pa->nextLink;

    }//End First Loop

}//End Sorting function
//--------------------------------------------------------------------------


//Search Function
/*
 * we can search contact by name , by phone number and by email
 */
void Search_contact(struct Contact_List *ContactListhead,struct RE_list **head_of_RE){
    struct Contact_List *temp= NULL;
    temp = ContactListhead;
    if(temp == NULL){
        printf("\nContact List is Empty\n");
    } else{
        int choice;
        //Choice to search
        printf("\n********************************* Search Contact *******************************");
        printf("\n->Press 1 to search By Nam\n->Press 2 to Search By Phone No\n->Press 3 to Search By Email\n");
        printf("\n********************************************************************************************");
        printf("\n:");
        scanf("%d",&choice);
        if(choice == 1){
            char searchedName[50];
            printf("\nEnter the Name: ");
            fflush(stdin);
            gets(searchedName);
            int v = 0;
            while(temp != NULL){
                if(strcmp(searchedName , temp->Contact_name ) == 0){
                    v = 1;
                    break;
                } else{
                    temp = temp->nextLink;
                }
            }//end loop
                if(v == 1){
                    printf("\n*********Contact found*********  ");
                    printf("\nName : %s",temp->Contact_name);
                    printf("\nEmail : %s",temp->Contact_email);
                    printf("\nPhone # : %s",temp->Contact_number);

                    recent_contact(head_of_RE,temp->Contact_name);
                    printf("\n---------------------------------------------\n");
                } else{
                    printf("\nNo Results Found\n");
                    printf("\n---------------------------------------------\n");
                }
        }//End First Choice
        //***** Code for Searching by Phone Number***
        else if(choice == 2){
            char search_number[40];
            printf("\nEnter the Phone Number: ");
            scanf("%s",search_number);
            int c = 0;
            while(temp != NULL){
                if(strcmp(search_number , temp->Contact_number ) == 0){
                    c = 1;
                    break;
                } else{
                    temp = temp->nextLink;
                }
            }//end loop
            if(c == 1){
                printf("\n*********Contact found*********  ");
                printf("\nName : %s",temp->Contact_name);
                printf("\nEmail : %s",temp->Contact_email);
                printf("\nPhone # : %s",temp->Contact_number);

                recent_contact(head_of_RE,temp->Contact_name);//Calling Recent Contact function, to store the recent contacts
                printf("\n---------------------------------------------\n");
            } else{
                printf("\nNo Results Found\n");
                printf("\n---------------------------------------------\n");
            }
        }//end Choice 2nd
        //***Code for Searching by email****
        else if(choice == 3){
            char search_mail[40];
            printf("\nEnter the Email: ");
            scanf("%s",search_mail);
            int v = 0;
            while(temp != NULL){
                if(strcmp(search_mail , temp->Contact_email ) == 0){
                    v = 1;
                    break;
                } else{
                    temp = temp->nextLink;
                }
            }//end loop
            if(v == 1){
                printf("\n*********Contact found*********  ");
                printf("\nName\t : %s",temp->Contact_name);
                printf("\nEmail\t : %s",temp->Contact_email);
                printf("\nPhone #\t : %s",temp->Contact_number);
                recent_contact(head_of_RE,temp->Contact_name);//Calling Recent Contact function, to store the recent contacts
                printf("\n---------------------------------------------\n");
            } else{
                printf("\nNo Results Found\n");
                printf("---------------------------------------------\n");
            }
        }//End 3rd choice
    }
}//End Searching Function






//***** Recent Contact Storing Function*****
/*
 * for storing recent nodes we are using stack made up of linked list
 * for making of stack by linked we just have to insert values at the front of the list
 */
void recent_contact(struct RE_list **head_of_RE ,char name[50] ){
    if(*head_of_RE == NULL){
        r = malloc(sizeof(struct RE_list));
        strcpy(r->RE_Name,name);
        r->link = NULL;
        *head_of_RE = r;
    } else{
        struct RE_list *q = NULL;
        q = malloc(sizeof (struct RE_list));
        strcpy(q->RE_Name,name);
        q->link = *head_of_RE;
        *head_of_RE = q;
    }
}
//End Recent funtion

//Display Funtion for recent contact
void displayrecent(struct RE_list *head_of_re){
    struct RE_list *temp =NULL;
    temp = head_of_re;
    printf("\n******************** Recent Contacts ***************");
    if(head_of_re == NULL){
        printf("\nNo Recent Contact");
        printf("\n--------------------------------------\n");
    } else{
        int counter = 1;
        while (temp!= NULL){
            printf("\n%d.%s",counter,temp->RE_Name);
            temp =temp->link;
            counter++;
        }
        printf("\n--------------------------------------\n");
    }
}
//End Recent Display





//Delete Function for the contacts in the phone book
int delete_contact(struct Contact_List **ContactListhead, char delname[50]){
    struct Contact_List *temp = NULL;
    struct Contact_List *temp1 = NULL;
    temp = *ContactListhead;
    if(check_the_positionof(*ContactListhead,delname) == 0){
        printf("\nContact Not found\n");
    } else if(check_the_positionof(*ContactListhead , delname) == 1){
        printf("\n\t\t*****Are u Sure you want to Delete Y/N****");
        char confirm = 'n';
        scanf("%c",&confirm);
        if(confirm == 'y'){
            *ContactListhead = temp->nextLink;
            free(temp);
            printf("\n----------- Contact Deleted ------------\n");
            return 1;
        } else{
            return 0;
        }
        //End First Condition
    } else {
            printf("\n\t\t*****Are u Sure you want to Delete Y/N****");
            char confirm = 'n';
            scanf("%c",&confirm);
            if(confirm == 'y'){
                int count =1;
                while (count != check_the_positionof(*ContactListhead,delname)){
                    count +=1;
                    temp1 = temp;
                    temp = temp->nextLink;
                }
                temp1->nextLink = temp->nextLink;
                free(temp);
                printf("\n--------------- Contact Deleted -------------------\n");
                return  1 ;
            } else{
                return 0;
            }
        }

}//End Delete Function


//Checking the position of the Contact.
/*
 * this is a supportive function for deletion purposes
 * we will find the position and then delete that contact
 */
int check_the_positionof(struct Contact_List *head,char delname[100]){
    struct Contact_List *temp = NULL;
    temp = head;
    int position = 1;
    while(temp != NULL){
        if(strcmp(delname , temp->Contact_name ) == 0){
            return position;
        } else{
            position ++;
            temp = temp->nextLink;
        }
    }//end loop
    return 0;


}//End Check Position


//Update Contact
/*
 * this function is used to update the contacts
 */
void update_function(struct Contact_List *head,struct Contact_List *HeadF){
char update_name[100];
struct Contact_List *temp =NULL;
temp =head;
int c = 0;
if(head == NULL){
    printf("\nThere is no Contact\n");
    } else{
    printf("\n****************************Updating Contact****************");
    printf("\nEnter the Name you want to Edit: ");
    fflush(stdin);
    gets(update_name);
    while(temp != NULL){
        if(strcmp(update_name,temp->Contact_name) == 0){
            c = 1;
            break;
        } else{
            temp =temp->nextLink;
        }
    }
    if(c == 1){
        printf("\nOriginal Contact Data is \n");
        printf("\n->Name : %s",temp->Contact_name);
        printf("\n->Email : %s",temp->Contact_email);
        printf("\n->Number : %s",temp->Contact_number);
        char new_name[100],new_email[100], new_number[100];

        printf("\n\nEnter New Name: ");
        fflush(stdin);
        gets(new_name);
        printf("Enter New Email: ");
        scanf("%s",&new_email);
        printf("Enter New Number: ");
        scanf("%s",&new_number);
        strcpy(temp->Contact_name,new_name);
        strcpy(temp->Contact_email,new_email);
        strcpy(temp->Contact_number,new_number);
        update_fav(HeadF,update_name,new_name,new_number,new_email);
        printf("");
        printf("\n**************** Contact Update *************************\n");
    } else{
        printf("\nContact Not Found");
    }
}
}//End Update Function




// ******************* Fav Function ***************************
void add_fav_Contact(struct Contact_List *head, struct Contact_List **headf){
    struct Contact_List *temp = NULL;
    temp = head;
    if(temp == NULL){
        printf("\nPhone Book is Empty\n");
    } else{
        char fav_n [50];
        printf("\nEnter the Name to Add in Fav List: ");
        fflush(stdin);
        gets(fav_n);
        int c = 0;
        while (temp !=NULL){
            if(strcmp(fav_n,temp->Contact_name) == 0){
                c =1;
                break;
            } else{
                temp = temp->nextLink;
            }
        }//End loop

        if(c == 1){
            insert_Contact(headf, temp->Contact_name,temp->Contact_email,temp->Contact_number); // Calling the insert function to insert favariouts contact
            /*
             * the insert function is same as before just head is different
             */
            printf("\n****** %s is Added in the Favorite list *******",temp->Contact_name);
            } else{
            printf("\n*** No Such results ***\n");
        }
    }
}//End add_fav_Contact function



// ****** Delete add_fav_Contact Contact Function ********
void del_fav(struct Contact_List **HeadF,char delname[100]){
    struct Contact_List *temp = NULL;
    struct Contact_List *temp1 = NULL;
    temp = *HeadF;
    if(check_the_positionof(*HeadF,delname) == 0){
        printf("\n********* Contact Not found in Fav List********\n");
    } else if(check_the_positionof(*HeadF , delname) == 1){
            *HeadF = temp->nextLink;
            free(temp);
            printf("\n***Contact Deleted ***");
             //End First Condition
    } else {
        int count = 1;
        while (count != check_the_positionof(*HeadF, delname)) {
            count += 1;
            temp1 = temp;
            temp = temp->nextLink;
        }
        temp1->nextLink = temp->nextLink;
        free(temp);
        printf("\n***Contact Deleted ***");
    }

}//End Fav Contact Delete Function


// Update Function of Fav Contact
/*
 * this function is called in the update contact so when we update the contact it check that if the contact is also in fav
 * if it is fav then it also updates it
 */

void update_fav(struct Contact_List *HeadF,char update_name[], char name[],char phone[],char email[]){
     struct Contact_List *temp =NULL;
    temp =HeadF;
    int c = 0;
        while(temp != NULL){
            if(strcmp(update_name,temp->Contact_name) == 0){
                c = 1;
                break;
            } else{
                temp =temp->nextLink;
            }
        }
        if(c == 1){
            strcpy(temp->Contact_name,name);
            strcpy(temp->Contact_email,email);
            strcpy(temp->Contact_number,phone);
            printf("");

        }
    }//End Update Favor Contacts


//*************************** Completed *****************************