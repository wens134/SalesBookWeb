import { AbstractDomain } from '../common/abstract-domain';
import { Address } from '../common/address';
import { Contact } from '../common/contact';
export interface Customer extends AbstractDomain {

    name:string;
	
	address?:Address;

    location?:Location;

    contact?:Contact;
    
}
