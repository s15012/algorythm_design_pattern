#! /usr/bin/python3

import time
import random


LOOP_COUNT = 1000000

def Janken_hands():
    user = random.randint(1,4)
    computer = random.randint(1,4)

    return (user,computer)



def Janken_9root(user, computer):
    gu = 1
    tyoki = 2
    pa = 3

    draw = 1
    win = 2
    lose = 3

    judge = 0

    if user == gu and computer == gu:
        judge = draw
    elif user == gu and computer == tyoki:
        judge = win
    elif user == gu and computer == pa:
        judge = lose
    elif user == tyoki and computer == gu:
        judge = lose
    elif user == tyoki and computer == tyoki:
        judge = draw
    elif user == tyoki and computer == pa:
        judge = win
    elif judge == pa and computer == gu:
        judge = win
    elif judge == pa and computer == tyoki:
        judge = lose
    elif judge == pa and computer == pa:
        judge = draw
"""
    if judge == draw:
        print("あいこ")
    elif judge == win:
        print("勝ち")
    elif judge == lose:
        print("負け")
"""





def Janken_3root(user, computer):
    gu = 1
    tyoki = 2
    pa = 3

    draw = 1
    win = 2
    lose = 3

    judge = 0

    if user == computer:
        judge = draw
    elif (user == gu and computer == tyoki) or (user == tyoki and computer == pa) or (user == pa and computer == gu):
        judge = win
    else:
        judge = lose
"""
    if judge == draw:
        print('あいこ')
    elif judge == win:
        print('勝ち')
    elif judge == lose:
        print('負け')
"""

"""
def Janken_calc(user, computer):
    gu = 1
    tyoki = 2
    pa = 3

    draw = 0
    win =1
    lose = 2

    judge = (user - computer + 3) % 3

    if (judge == draw):
        print("あいこ")
    elif (judge == win):
        print("勝ち")
    elif (judge == lose):
        print("負け")
"""


def Janken_calc (user, computer):
    DRAW = 0
    WIN = 1
    LOSE = 2
    judge = (player - computer + 3) % 3

    if(judge == DRAW):
        return
    elif(judge == WIN):
        return
    elif(judge == LOSE):
        return



def Janken_Structure(user, computer):

    gu = 1
    tyoki = 2
    pa = 3

    draw = 1
    win = 2
    lose = 3

    judge = [
            [ draw, win, lose],
            [ lose, draw, win],
            [ win, lose, draw]

            ]
"""
    if (judge[user - 1][computer - 1] == draw):
        print("あいこ\n")
    elif (judge[user - 1][computer - 1] == win):
        print("勝ち\n")
    elif (judge[user - 1][computer - 1] == lose):
        print("負け\n")
"""
if __name__ == "__main__":


    start = time.time()

    for _ in range(LOOP_COUNT):
        player, cpu = Janken_hands()
        Janken_9root(player, cpu)

    end = time.time()
    print("9通りじゃんけん:\n経過時間:", (end - start), "\n")




    start = time.time()

    for _ in range(LOOP_COUNT):

        player, cpu = Janken_hands()
        Janken_3root(player, cpu)

    end = time.time()
    print("3通りじゃんけん:\n経過時間:", (end - start), "\n")



    start = time.time()

    for _ in range(LOOP_COUNT):

        player, cpu = Janken_hands()

        Janken_calc(player, cpu)

    end = time.time()
    print("計算式じゃんけん？:\n経過時間:", (end - start), "\n")


    start = time.time()

    for _ in range(LOOP_COUNT):

        player, cpu = Janken_hands()
        Janken_Structure(player, cpu)


    end = time.time()
    print("構造体がどうのこうの:\n経過時間:", (end - start), "\n")

