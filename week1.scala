def pascal(c: Int, r: Int): Int =
    if (c == 0 || c == r) 1 else pascal(c-1, r-1) + pascal(c, r-1)

pascal(1,2)
pascal(3,5)

def balance(chars: List[Char]): Boolean = {
    
    def count(chars: List[Char], current: Int):Int =
        if (chars.isEmpty || current < 0) current
        else if (chars.head == '(') count(chars.tail, current + 1)
        else if (chars.head == ')') count(chars.tail, current - 1)
        else count(chars.tail, current)      
    
    count(chars,0) == 0
}

balance("(if (zero? x) max (/ 1 x))".toList)
balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList)
balance(":-)".toList)
balance(")()(".toList)
