# This file will be hidden in student mode
from typing import Optional


def safe_user_input() -> Optional[int]:
    """
    Function to safely read user input and ensure the input is within range [-40, 40].
    Returns the input as an integer.
    """
    error_message = "The temperature should be in range [-40; 40]"
    while True:
        try:
            # Prompt the user for input
            print(f"Please input temperature. {error_message}:")
            temperature = safe_read_line()

            # Check if the input is valid
            if is_correct_input(temperature):
                return int(temperature)
        except ValueError:
            # Continue asking until a valid input is given
            continue


def is_correct_input(temperature: str) -> bool:
    """
    Check if the input string can be converted to an integer and within the range.
    """
    try:
        int_temp = int(temperature)
        return -40 <= int_temp <= 40
    except ValueError:
        return False


def safe_read_line() -> str:
    """
    Read input from the user safely and raise an error if the input is empty.
    """
    user_input = input().strip()
    if not user_input:
        raise ValueError("Your input is incorrect, sorry. Please, input a number.")
    return user_input
