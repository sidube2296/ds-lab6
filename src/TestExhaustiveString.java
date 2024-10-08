import java.util.Comparator;

import java.util.Iterator;

import java.util.List;

import edu.uwm.cs351.ArrayBag;

import junit.framework.TestCase;

public class TestExhaustiveString extends TestCase {
  private Comparator<String> comp = (a,b) -> a.compareTo(b);
  private ArrayBag<String> ss;
  @Override
  protected void setUp() {
    ss = new ArrayBag<String>();
  }

  public void test1001() {
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertFalse(it.hasNext());
  }

  public void test2001() {
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertFalse(it.hasNext());
  }

  public void test2002() {
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertFalse(it.hasNext());
  }

  public void test3001() {
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertFalse(it.hasNext());
  }

  public void test3002() {
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertFalse(it.hasNext());
  }

  public void test3003() {
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertFalse(it.hasNext());
  }

  public void test3004() {
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertFalse(it.hasNext());
  }

  public void test3005() {
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertFalse(it.hasNext());
  }

  public void test3006() {
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4001() {
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4002() {
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4003() {
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4004() {
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4005() {
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4006() {
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4007() {
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4008() {
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4009() {
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4010() {
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4011() {
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4012() {
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4013() {
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4014() {
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4015() {
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4016() {
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4017() {
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4018() {
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4019() {
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4020() {
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4021() {
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4022() {
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4023() {
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test4024() {
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5001() {
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5002() {
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5003() {
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5004() {
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5005() {
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5006() {
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5007() {
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5008() {
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5009() {
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5010() {
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5011() {
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5012() {
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5013() {
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5014() {
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5015() {
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5016() {
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5017() {
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5018() {
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5019() {
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5020() {
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5021() {
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5022() {
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5023() {
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5024() {
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5025() {
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5026() {
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5027() {
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5028() {
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5029() {
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5030() {
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5031() {
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5032() {
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5033() {
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5034() {
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5035() {
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5036() {
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5037() {
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5038() {
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5039() {
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5040() {
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5041() {
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5042() {
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5043() {
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5044() {
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5045() {
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5046() {
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5047() {
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5048() {
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5049() {
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5050() {
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5051() {
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5052() {
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5053() {
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5054() {
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5055() {
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5056() {
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5057() {
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5058() {
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5059() {
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5060() {
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5061() {
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5062() {
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5063() {
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5064() {
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5065() {
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5066() {
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5067() {
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5068() {
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5069() {
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5070() {
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5071() {
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5072() {
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5073() {
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5074() {
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5075() {
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5076() {
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5077() {
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5078() {
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5079() {
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5080() {
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5081() {
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5082() {
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5083() {
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5084() {
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5085() {
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5086() {
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5087() {
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5088() {
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5089() {
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5090() {
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5091() {
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5092() {
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5093() {
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5094() {
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5095() {
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5096() {
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5097() {
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5098() {
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5099() {
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5100() {
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5101() {
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5102() {
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5103() {
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5104() {
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5105() {
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5106() {
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5107() {
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5108() {
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5109() {
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5110() {
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5111() {
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5112() {
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5113() {
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5114() {
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5115() {
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5116() {
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5117() {
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5118() {
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5119() {
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test5120() {
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6001() {
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6002() {
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6003() {
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6004() {
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6005() {
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6006() {
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6007() {
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6008() {
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6009() {
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6010() {
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6011() {
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6012() {
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6013() {
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6014() {
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6015() {
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6016() {
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6017() {
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6018() {
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6019() {
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6020() {
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6021() {
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6022() {
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6023() {
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6024() {
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6025() {
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6026() {
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6027() {
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6028() {
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6029() {
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6030() {
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6031() {
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6032() {
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6033() {
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6034() {
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6035() {
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6036() {
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6037() {
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6038() {
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6039() {
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6040() {
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6041() {
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6042() {
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6043() {
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6044() {
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6045() {
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6046() {
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6047() {
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6048() {
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6049() {
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6050() {
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6051() {
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6052() {
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6053() {
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6054() {
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6055() {
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6056() {
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6057() {
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6058() {
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6059() {
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6060() {
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6061() {
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6062() {
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6063() {
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6064() {
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6065() {
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6066() {
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6067() {
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6068() {
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6069() {
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6070() {
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6071() {
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6072() {
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6073() {
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6074() {
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6075() {
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6076() {
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6077() {
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6078() {
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6079() {
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6080() {
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6081() {
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6082() {
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6083() {
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6084() {
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6085() {
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6086() {
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6087() {
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6088() {
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6089() {
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6090() {
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6091() {
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6092() {
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6093() {
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6094() {
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6095() {
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6096() {
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6097() {
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6098() {
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6099() {
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6100() {
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6101() {
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6102() {
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6103() {
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6104() {
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6105() {
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6106() {
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6107() {
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6108() {
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6109() {
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6110() {
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6111() {
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6112() {
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6113() {
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6114() {
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6115() {
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6116() {
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6117() {
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6118() {
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6119() {
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6120() {
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6121() {
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6122() {
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6123() {
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6124() {
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6125() {
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6126() {
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6127() {
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6128() {
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6129() {
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6130() {
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6131() {
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6132() {
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6133() {
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6134() {
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6135() {
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6136() {
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6137() {
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6138() {
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6139() {
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6140() {
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6141() {
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6142() {
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6143() {
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6144() {
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6145() {
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6146() {
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6147() {
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6148() {
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6149() {
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6150() {
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6151() {
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6152() {
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6153() {
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6154() {
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6155() {
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6156() {
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6157() {
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6158() {
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6159() {
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6160() {
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6161() {
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6162() {
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6163() {
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6164() {
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6165() {
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6166() {
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6167() {
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6168() {
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6169() {
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6170() {
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6171() {
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6172() {
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6173() {
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6174() {
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6175() {
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6176() {
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6177() {
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6178() {
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6179() {
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6180() {
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6181() {
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6182() {
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6183() {
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6184() {
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6185() {
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6186() {
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6187() {
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6188() {
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6189() {
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6190() {
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6191() {
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6192() {
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6193() {
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6194() {
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6195() {
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6196() {
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6197() {
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6198() {
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6199() {
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6200() {
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6201() {
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6202() {
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6203() {
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6204() {
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6205() {
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6206() {
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6207() {
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6208() {
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6209() {
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6210() {
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6211() {
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6212() {
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6213() {
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6214() {
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6215() {
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6216() {
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6217() {
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6218() {
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6219() {
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6220() {
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6221() {
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6222() {
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6223() {
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6224() {
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6225() {
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6226() {
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6227() {
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6228() {
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6229() {
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6230() {
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6231() {
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6232() {
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6233() {
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6234() {
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6235() {
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6236() {
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6237() {
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6238() {
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6239() {
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6240() {
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6241() {
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6242() {
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6243() {
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6244() {
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6245() {
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6246() {
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6247() {
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6248() {
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6249() {
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6250() {
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6251() {
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6252() {
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6253() {
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6254() {
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6255() {
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6256() {
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6257() {
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6258() {
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6259() {
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6260() {
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6261() {
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6262() {
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6263() {
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6264() {
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6265() {
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6266() {
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6267() {
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6268() {
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6269() {
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6270() {
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6271() {
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6272() {
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6273() {
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6274() {
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6275() {
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6276() {
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6277() {
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6278() {
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6279() {
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6280() {
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6281() {
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6282() {
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6283() {
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6284() {
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6285() {
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6286() {
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6287() {
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6288() {
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6289() {
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6290() {
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6291() {
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6292() {
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6293() {
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6294() {
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6295() {
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6296() {
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6297() {
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6298() {
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6299() {
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6300() {
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6301() {
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6302() {
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6303() {
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6304() {
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6305() {
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6306() {
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6307() {
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6308() {
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6309() {
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6310() {
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6311() {
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6312() {
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6313() {
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6314() {
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6315() {
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6316() {
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6317() {
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6318() {
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6319() {
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6320() {
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6321() {
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6322() {
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6323() {
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6324() {
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6325() {
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6326() {
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6327() {
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6328() {
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6329() {
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6330() {
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6331() {
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6332() {
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6333() {
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6334() {
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6335() {
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6336() {
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6337() {
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6338() {
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6339() {
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6340() {
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6341() {
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6342() {
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6343() {
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6344() {
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6345() {
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6346() {
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6347() {
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6348() {
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6349() {
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6350() {
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6351() {
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6352() {
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6353() {
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6354() {
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6355() {
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6356() {
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6357() {
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6358() {
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6359() {
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6360() {
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6361() {
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6362() {
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6363() {
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6364() {
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6365() {
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6366() {
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6367() {
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6368() {
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6369() {
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6370() {
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6371() {
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6372() {
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6373() {
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6374() {
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6375() {
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6376() {
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6377() {
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6378() {
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6379() {
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6380() {
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6381() {
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6382() {
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6383() {
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6384() {
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6385() {
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6386() {
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6387() {
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6388() {
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6389() {
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6390() {
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6391() {
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6392() {
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6393() {
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6394() {
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6395() {
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6396() {
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6397() {
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6398() {
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6399() {
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6400() {
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6401() {
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6402() {
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6403() {
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6404() {
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6405() {
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6406() {
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6407() {
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6408() {
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6409() {
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6410() {
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6411() {
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6412() {
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6413() {
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6414() {
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6415() {
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6416() {
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6417() {
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6418() {
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6419() {
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6420() {
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6421() {
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6422() {
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6423() {
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6424() {
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6425() {
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6426() {
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6427() {
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6428() {
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6429() {
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6430() {
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6431() {
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6432() {
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6433() {
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6434() {
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6435() {
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6436() {
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6437() {
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6438() {
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6439() {
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6440() {
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6441() {
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6442() {
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6443() {
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6444() {
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6445() {
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6446() {
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6447() {
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6448() {
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6449() {
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6450() {
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6451() {
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6452() {
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6453() {
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6454() {
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6455() {
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6456() {
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6457() {
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6458() {
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6459() {
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6460() {
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6461() {
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6462() {
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6463() {
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6464() {
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6465() {
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6466() {
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6467() {
    ss.add("A");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6468() {
    ss.add("D");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6469() {
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6470() {
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6471() {
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6472() {
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6473() {
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6474() {
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6475() {
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6476() {
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6477() {
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6478() {
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6479() {
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6480() {
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6481() {
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6482() {
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6483() {
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6484() {
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6485() {
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6486() {
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6487() {
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6488() {
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6489() {
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6490() {
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6491() {
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6492() {
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6493() {
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6494() {
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6495() {
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6496() {
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6497() {
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6498() {
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6499() {
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6500() {
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6501() {
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6502() {
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6503() {
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6504() {
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6505() {
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6506() {
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6507() {
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6508() {
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6509() {
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6510() {
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6511() {
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6512() {
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6513() {
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6514() {
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6515() {
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6516() {
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6517() {
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6518() {
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6519() {
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6520() {
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6521() {
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6522() {
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6523() {
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6524() {
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6525() {
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6526() {
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6527() {
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6528() {
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6529() {
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6530() {
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6531() {
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6532() {
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6533() {
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6534() {
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6535() {
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6536() {
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6537() {
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6538() {
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6539() {
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6540() {
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6541() {
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6542() {
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6543() {
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6544() {
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6545() {
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6546() {
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6547() {
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6548() {
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6549() {
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6550() {
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6551() {
    ss.add("A");
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6552() {
    ss.add("C");
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6553() {
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6554() {
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6555() {
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6556() {
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6557() {
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6558() {
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6559() {
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6560() {
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6561() {
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6562() {
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6563() {
    ss.add("A");
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6564() {
    ss.add("B");
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6565() {
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6566() {
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6567() {
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6568() {
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6569() {
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6570() {
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6571() {
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6572() {
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6573() {
    ss.add("A");
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6574() {
    ss.add("E");
    ss.add("A");
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6575() {
    ss.add("F");
    ss.add("A");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6576() {
    ss.add("A");
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6577() {
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6578() {
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6579() {
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6580() {
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6581() {
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6582() {
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6583() {
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6584() {
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6585() {
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6586() {
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6587() {
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6588() {
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6589() {
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6590() {
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6591() {
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6592() {
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6593() {
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6594() {
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6595() {
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6596() {
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6597() {
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6598() {
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6599() {
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6600() {
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.add("D");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6601() {
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6602() {
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6603() {
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6604() {
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6605() {
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6606() {
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6607() {
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6608() {
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6609() {
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6610() {
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6611() {
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6612() {
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6613() {
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6614() {
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6615() {
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6616() {
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6617() {
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6618() {
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6619() {
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6620() {
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6621() {
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6622() {
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6623() {
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6624() {
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6625() {
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6626() {
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6627() {
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6628() {
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6629() {
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6630() {
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6631() {
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6632() {
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6633() {
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6634() {
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6635() {
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6636() {
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6637() {
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6638() {
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6639() {
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6640() {
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6641() {
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6642() {
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6643() {
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6644() {
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6645() {
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6646() {
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6647() {
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6648() {
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6649() {
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6650() {
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6651() {
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6652() {
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6653() {
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6654() {
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6655() {
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6656() {
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6657() {
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6658() {
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6659() {
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6660() {
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6661() {
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6662() {
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6663() {
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6664() {
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6665() {
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6666() {
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6667() {
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6668() {
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6669() {
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6670() {
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6671() {
    ss.add("F");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6672() {
    ss.add("C");
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6673() {
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6674() {
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6675() {
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6676() {
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6677() {
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6678() {
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6679() {
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6680() {
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6681() {
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6682() {
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6683() {
    ss.add("F");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6684() {
    ss.add("B");
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6685() {
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6686() {
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6687() {
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6688() {
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6689() {
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6690() {
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6691() {
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6692() {
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6693() {
    ss.add("F");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6694() {
    ss.add("E");
    ss.add("F");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6695() {
    ss.add("D");
    ss.add("F");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6696() {
    ss.add("F");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6697() {
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6698() {
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6699() {
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6700() {
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6701() {
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6702() {
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6703() {
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6704() {
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6705() {
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6706() {
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6707() {
    ss.add("D");
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6708() {
    ss.add("C");
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6709() {
    ss.add("C");
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6710() {
    ss.add("E");
    ss.add("C");
    ss.add("B");
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6711() {
    ss.add("B");
    ss.add("C");
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6712() {
    ss.add("C");
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6713() {
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6714() {
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("D");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6715() {
    ss.add("B");
    ss.add("E");
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6716() {
    ss.add("E");
    ss.add("B");
    ss.add("D");
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6717() {
    ss.add("D");
    ss.add("B");
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6718() {
    ss.add("B");
    ss.add("D");
    ss.add("E");
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6719() {
    ss.add("E");
    ss.add("D");
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

  public void test6720() {
    ss.add("D");
    ss.add("E");
    ss.add("B");
    ss.add("C");
    ss.add("F");
    ss.add("A");
    ss.sort(comp);
    List<String> ls = ss.toList();
    Iterator<String> it = ls.iterator();
    assertEquals ("A", it.next() );
    assertEquals ("B", it.next() );
    assertEquals ("C", it.next() );
    assertEquals ("D", it.next() );
    assertEquals ("E", it.next() );
    assertEquals ("F", it.next() );
    assertFalse(it.hasNext());
  }

}
