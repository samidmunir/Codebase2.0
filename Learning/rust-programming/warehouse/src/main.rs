mod inventory;
mod orders;

/*
    3 ways to declare a module.
    1) in-line declaration
    2) file with the name of the module
    3) folder with the name of the module, with a mod.rs file within it

    The Rust compiler will throw an error/warning when it finds two or modules with the same name.
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
    println!("The available floor space is {} sqft.", orders::FLOOR_SPACE);
    orders::talk_to_manager();

    let favorite_category = inventory::ProductCategory::Ladder;
    println!("\nMy favorite category of items is {favorite_category:?}.");

    let tall_ladder = inventory::Item {
        name: String::from("Premium Folding Ladder"),
        category: favorite_category,
        quantity: 10,
    };
    println!("\ntall_ladder: {tall_ladder:#?}")
}
