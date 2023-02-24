/**
 * 
 */
package Challenge14;

/**
 * @author tusharkurhekar
 *
 */
public class LinkedListCycle {

	/**
	 * 
	 */
	public boolean LinkedListCycle(ListNode head) {
        
        if(head ==null){
            return false;
        }

        ListNode slow=head, fast=head;

        while(fast.next!=null &&fast.next.next !=null){
            fast=fast.next.next;
            slow = slow.next;
            if(fast==slow) return true;
        }

        return false;

	}

}
