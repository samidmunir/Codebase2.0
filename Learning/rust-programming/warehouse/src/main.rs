mod inventory;

mod orders {
    pub const MANAGER: &str = "Oliver Orderson";
}

/*
    3 ways to declare a module.
    1) in-line declaration
    2) file with the name of the modules
    3) //
*/
fn main() {
    println!("\nWarehouse Project");
    println!(
        "- This project is intended to understand Rust file/folder structuring (modules & crates)."
    );

    println!("\nThe manager of our inventory is {}.", inventory::MANAGER);
    println!(
        "The available floor space is {} sqft.",
        inventory::FLOOR_SPACE
    );
    inventory::talk_to_manager();

    println!("\nThe manager of our orders is {}.", orders::MANAGER);
}
