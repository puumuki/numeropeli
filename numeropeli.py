import random

def ask_number():
    try:
        return int(input("Anna numero >"),10)
    except ValueError:
        return ask_number()

def main():

    amount_of_ask = 3
    rand_number = random.randint(1, 10)

    print("Arvaa numero 1-10 valilla, sinulla on kaytettavissa %s arvausta" % amount_of_ask)

    while amount_of_ask > 0:
        
        user_input = ask_number()   

        if user_input is rand_number:       
            print("Arvasit numeron okein, onnittelu :)")
            break

        if user_input < rand_number:
            print("Numero on suurempi")

        if user_input > rand_number:
            print("Numero on pienempi")

        amount_of_ask -= 1
    else:
        print("Et arvannut numeroa")

if __name__ == '__main__':
    main()