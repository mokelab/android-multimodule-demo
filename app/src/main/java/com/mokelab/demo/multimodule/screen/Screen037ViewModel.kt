package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data361RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data362RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data363RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data364RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data365RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data366RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data367RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data368RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data369RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data370RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen037ViewModel @Inject constructor(
    private val repo1: Data361RepositoryImpl,
    private val repo2: Data362RepositoryImpl,
    private val repo3: Data363RepositoryImpl,
    private val repo4: Data364RepositoryImpl,
    private val repo5: Data365RepositoryImpl,
    private val repo6: Data366RepositoryImpl,
    private val repo7: Data367RepositoryImpl,
    private val repo8: Data368RepositoryImpl,
    private val repo9: Data369RepositoryImpl,
    private val repo10: Data370RepositoryImpl,

): ViewModel() {
}
