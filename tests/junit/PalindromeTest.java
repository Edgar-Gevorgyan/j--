package junit;

import junit.framework.TestCase;
import pass.Palindrome;

public class PalindromeTest extends TestCase 
{
	private Palindrome pal;
	
	protected void setUp() throws Exception
	{
		super.setUp();
		pal = new Palindrome();
	}
	
	protected void tearDown() throws Exception
	{
		super.tearDown();
	}
	
	public void testPalindrome()
	{
		this.assertEquals(pal.palindrome("aba"), "aba");
		this.assertEquals(pal.palindrome("abba"), "abba");
		this.assertEquals(pal.palindrome("abca"), "");
		this.assertEquals(pal.palindrome("AbBa"), "AbBa");
		this.assertEquals(pal.palindrome("Ka yAk"), "Ka yAk");
		this.assertEquals(pal.palindrome("K     a yYyY A    k"), "K     a yYyY A    k");
		this.assertEquals(pal.palindrome("K a yaq"), "");
	}
}
