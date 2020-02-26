"""
Modul koji predstavlja pokretacki deo aplikacije.

"""

from tree import *


if __name__ == '__main__':
    # instanca stabla
    t = Tree()
    t.root = TreeNode(0)

    # kreiranje relacija između novih čvorova
    a = TreeNode(1)
    b = TreeNode(2)
    c = TreeNode(3)

    a.add_child(b)
    t.root.add_child(a)
    t.root.add_child(c)

    # visina stabla
    print('Visina = %d' % t.height(t.root))

    # dubina čvora
    print('Dubina(a) = %d' % t.depth(a))

    # obilazak po dubini - preorder
    print('PREORDER')
    t.preorder(t.root)

    # obilazak po dubini - postorder
    print('POSTORDER')
    t.postorder(t.root)

    # obilazak po širini
    print('BREADTH FIRST')
    t.breadth_first()

    print("ITER")
    for node in t:
        print(node)
